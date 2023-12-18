import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        String ans="";
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            if(!(ans.isEmpty()))System.out.printf(" ");
            String str=sc.next();
            int N=str.length();
            ans="";
            for(int i=0;i<N;i++){
                if(str.charAt(i)!=str.substring(i,i+1).toUpperCase().charAt(0))ans+=str.substring(i,i+1).toUpperCase();
                else if(str.charAt(i)!=str.substring(i,i+1).toLowerCase().charAt(0))ans+=str.substring(i,i+1).toLowerCase();
                else ans+=str.substring(i,i+1);
            }
            System.out.printf("%s",ans);
        }
        System.out.println();
        sc.close();
    }
}
