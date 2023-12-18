import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if (n==0) break;
            String[] formula = new String[n];

            for (int i = 0; i < n; i++) {
                formula[i] = sc.next();
            }

            System.out.println(((n==1)?Integer.parseInt(formula[0]):dfs(formula, 0, n)));
        }
    }

    static int dfs(String[] formula, int s, int e) {
        int num = (formula[s].charAt(formula[s].length()-1)=='+')?0:1;
        int j = 0, ans = 1;
        for (int i = s+1; i < e; i++) {
            if(formula[i].charAt(formula[i].length()-1)!='*'&&formula[i].charAt(formula[i].length()-1)!='+'){
                ans = ((num==0)?ans+(formula[i].charAt(formula[i].length()-1) - '0'):ans*(formula[i].charAt(formula[i].length()-1) - '0'));
            }else {
                for (j = i+1; j < e; j++) {
                    if (formula[j].length()==formula[i].length()) break;
                }
                ans = ((num==0)?ans+dfs(formula, i, j):ans*dfs(formula, i, j));
                i = j-1;
            }
        }
        return (num==0)?ans-1:ans;
    }
}