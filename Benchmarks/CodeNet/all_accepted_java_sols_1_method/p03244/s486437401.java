import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] oddList = new int[100001];
    int[] evenList = new int[100001];
    for (int i =1; i<n+1; i++) {
      int v = sc.nextInt();
      if (i % 2 ==1) oddList[v]++;
      if (i % 2 ==0) evenList[v]++;
    }
    int maxOdd =0, maxEven =0, secondmaxOdd =0, secondmaxEven =0, countOdd =0, countEven =0;
    for (int i =1; i<100001; i++) {
      maxOdd = Math.max(oddList[i],maxOdd); 
      maxEven = Math.max(evenList[i],maxEven);
    }

    int oddnum =0, evennum =0;
    for (int i =1; i<100001; i++) {
      if (oddList[i] == maxOdd) {
        oddnum = i;
        countOdd++;
      }
      if (evenList[i] == maxEven) {
        evennum = i; 
        countEven++;
      }
    }  
    for (int i =1; i<100001; i++) {
      if (oddList[i] != maxOdd) {
        secondmaxOdd = Math.max(oddList[i], secondmaxOdd);
      }
      if (evenList[i] != maxEven) {
        secondmaxEven = Math.max(evenList[i], secondmaxEven);
      }
    }   
    if (countOdd >= 2) secondmaxOdd = maxOdd;
    if (countEven >= 2) secondmaxEven = maxEven;
    
    for (int i =1; i<100001; i++) {
      if (oddList[i] == maxOdd) oddnum = i;
      if (evenList[i] == maxEven) evennum = i; 
    }


    if (oddnum == evennum) {
      if(maxOdd > maxEven) {
        maxEven = secondmaxEven;
      } else if (maxOdd < maxEven) {
        maxOdd = secondmaxOdd;
      } else {
        maxEven = Math.max(secondmaxOdd,secondmaxEven);
      } 
    }
    int ans = n - maxOdd - maxEven;
    System.out.println(ans);
  }
}