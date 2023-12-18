import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x= "abcdefghijklmnopqrstuvwxyz";
        int[] cnt=new int[26];
        
        while(sc.hasNext()){
            String s=sc.nextLine();
            s=s.toLowerCase();
            
            for(int i=0;i<x.length();i++){
                for(int j=0;j<s.length();j++){
                  if(x.charAt(i)==(s.charAt(j))){
                     cnt[i]++;
                }
            }
          }
        }
        for(int i=0;i<x.length();i++)
            System.out.println(x.charAt(i)+" : "+cnt[i]);
        sc.close();          
    }
}
