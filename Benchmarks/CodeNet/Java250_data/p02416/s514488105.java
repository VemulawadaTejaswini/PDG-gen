import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l,i,j,n,S=0;
        String c="";
        for(i=0; ;i++){
            c=sc.next();    
            l=c.length();
            if(c.equals("0")){
                break;
            }else{
                for(j=0;j<=l-1;j++){
                    n=Integer.parseInt(c.substring(j,j+1));
                    S+=n;
                }
            }
            System.out.println(S); 
            S=0;                   
        } 
    }
}
