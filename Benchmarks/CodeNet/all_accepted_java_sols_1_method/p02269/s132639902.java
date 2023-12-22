import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count;
        int[] str=new int[10000000];//A,C,G,T
        for(int i=0;i<n;i++){
            count=0;
            String a=sc.next();
            String b=sc.next();
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)=='A')count+=1*Math.pow(5,j);
                else if(b.charAt(j)=='C')count+=2*Math.pow(5,j);
                else if(b.charAt(j)=='G')count+=3*Math.pow(5,j);
                else count+=4*Math.pow(5,j);
            }
            if(a.equals("insert")){
                str[count]++;
            }else{
                if(str[count]==0)System.out.println("no");
                else System.out.println("yes");
            }
        }
        sc.close();
    }
}
