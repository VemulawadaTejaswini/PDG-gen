import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k,i,l,j,n;
        String str="";
        int[] array;
        array=new int[26];
        for(k=0; ;k++){
            if((str=sc.next())==null){
                break;
            }
            str=str.toLowerCase();
            l=str.length();
            for(i=0;i<l;i++){
                for(j=65;j<=90;j++){
                    n=Integer.parseInt(str.substring(i));
                    if(n==j){
                        array[j-65]+=1;
                    }
                }
            }
        }
        
        for(k=65;k<=90;k++){
            System.out.println(Integer.toString(k)+" : "+array[k-65]);
        }
    }
}
