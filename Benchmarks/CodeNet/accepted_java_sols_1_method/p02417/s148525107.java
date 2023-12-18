import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           String s;
           boolean isf=false;
           int ans[]=new int[26];
           for(int i=0;i<26;i++){
               ans[i]=0;
           }
           while(sc.hasNextLine()){
               s=sc.nextLine();
          int n=s.length();
          s=s.toLowerCase();
          for(int i=0;i<n;i++){
            if('a'<=s.charAt(i)&&s.charAt(i)<='z'){
                  int add=s.charAt(i)-'a';
                  ans[add]++;
              }
          }
           }
           for(int i=0;i<26;i++){
               char x='a';
               x+=i;
               System.out.println(x+" : "+ans[i]);
           }
}
}

