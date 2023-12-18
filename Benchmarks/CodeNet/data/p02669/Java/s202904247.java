import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner("1 900000000000000000 332423423 454353412 934923490 987654321");
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      long N = sc.nextLong();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      Solution sol = new Solution(N, A, B, C, D);
      System.out.println(sol.getCost(N));
    }
    sc.close();
  }

  long doubleCost;
  long tripleCost;
  long fiveCost;
  long singleCost;
  HashMap<Long, BigInteger> dpTable = new HashMap<>();

  public Solution(long n, int a, int b, int c, int d) {
    doubleCost = a;
    tripleCost = b;
    fiveCost = c;
    singleCost = d;
  }

  public BigInteger getCost(long target) {
    if (target <= 1) {
      return singleCost(0, target);
    }
    if (dpTable.containsKey(target)) {
      return dpTable.get(target);
    }

    BigInteger best = singleCost(0, target);
    best = best.min(getDoubleCost(target));
    best = best.min(getTripleCost(target));
    best = best.min(getFiveCost(target));
        
    dpTable.put(target, best);
    return best;
  }

  private BigInteger getDoubleCost(long target) {
    BigInteger cost = singleCost(0, target);
    if (target % 2 == 0) {
      cost = cost.min(getCost(target / 2, target, doubleCost));
    } else {    
      long transitionCost = doubleCost + singleCost;  
      cost = cost.min(getCost(target / 2, target, transitionCost));
      cost = cost.min(getCost((target + 1) / 2, target, transitionCost));
    }
    return cost;
  }

  private BigInteger getTripleCost(long target) {
    BigInteger cost = singleCost(0, target);
    if (target % 3 == 0) {
      cost = cost.min(getCost(target / 3, target, tripleCost));
    } else if(target % 3 == 1) {
      // 3x + 1
      cost = cost.min(getCost(target / 3, target, tripleCost + singleCost));
    } else if(target % 3 == 2) {
      // 3(x + 1) - 1
      cost = cost.min(getCost((target + 1) / 3, target, tripleCost + singleCost));
    }
    return cost;
  }

  private BigInteger getFiveCost(long target) {
    BigInteger cost = singleCost(0, target);
    if (target % 5 == 0) {
      cost = cost.min(getCost(target / 5, target, fiveCost));
    } else if(target % 5 == 1) {
      // 5x + 1
      cost = cost.min(getCost(target / 5, target, fiveCost + singleCost));
    } else if(target % 5 == 2) {
      // 5x + 2
      cost = cost.min(getCost(target / 5, target, fiveCost + singleCost * 2));
    } else if(target % 5 == 3) {
      // 5(x + 1) - 2
      cost = cost.min(getCost((target + 2) / 5, target, fiveCost + singleCost * 2));
    } else if(target % 5 == 4) {
      // 5(x + 1) - 1
      cost = cost.min(getCost((target + 1) / 5, target, fiveCost + singleCost));
    }

    return cost;
  }

  private BigInteger getCost(long prev, long target, long transitionCost) {
    if (BigInteger.valueOf(transitionCost).compareTo(singleCost(prev, target)) < 0) {
      return BigInteger.valueOf(transitionCost).add(getCost(prev));
    }
    return singleCost(0, target);
  }

  private BigInteger singleCost(long prev, long target) {
    return BigInteger.valueOf(target - prev).multiply(BigInteger.valueOf(singleCost));
  }
}