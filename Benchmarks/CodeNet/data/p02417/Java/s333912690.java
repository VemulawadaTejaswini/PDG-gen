import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[200];
        while(sc.hasNext()){
            String s=sc.nextLine().toLowerCase();
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)]++;
            }
        }
        
        
        //for(int i=0;i<26;i++) a[i]=0;
        //char now='a';
        for(char now='a';now<='z';now++){
            System.out.print(now+" "+':'+" "+a[now]);
            System.out.println();
        }
    }
}
