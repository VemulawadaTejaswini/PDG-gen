import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String po=s.nextLine();
        char a[]=po.toCharArray();
        int i=0;
        int b[]=new int[200];
        for(char a1 : a){
            //System.out.println(a1);
            if(a1==' '){}
            else if(a1=='+'){ b[i-2]=b[i-2]+b[i-1]; i--;}
            else if(a1=='-'){ b[i-2]=b[i-2]-b[i-1]; i--;}
            else if(a1=='*'){ b[i-2]=b[i-2]*b[i-1]; i--;}
            else {
                int tmp=0;
                for(char a2:a){
                    if(a2==' ') break;
                    tmp=tmp*10+a1-'0';
                } 
                b[i]=tmp; i++;
            }
        }
        System.out.println(b[0]);
    }
}
