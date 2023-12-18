import java.util.Scanner;

public final class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int[][] lcs = new int[s1.length()+1][s2.length()+1];
        for(int i=1; i<=s1.length(); i++){
            for(int j=1; j<=s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    lcs[i][j] = lcs[i-1][j-1]+1;
                }else{
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        
        int i=s1.length(), j=s2.length();
        StringBuilder s = new StringBuilder(); 
        while(lcs[i][j] != 0){
            if(lcs[i][j] > Math.max(lcs[i-1][j], lcs[i][j-1])){
                s.append(s1.charAt(i-1));
                i = i-1;
                j = j-1;
            }else
            if(lcs[i][j] == Math.max(lcs[i-1][j], lcs[i][j-1])){
                if(lcs[i-1][j] > lcs[i][j-1]){
                    i = i-1;
                }else{
                    j = j-1;
                }
            }
        }
        System.out.println(s.reverse());
        sc.close();
    }
}