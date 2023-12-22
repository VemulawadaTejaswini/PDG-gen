import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
         
        int[] dic=new int[6];
        String s;
         
         
        for(int i=0;i<6;i++){
            dic[i]=scan.nextInt();
        }
        s=scan.next();
        int tmp;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='N'){
                tmp=dic[0];
                dic[0]=dic[1];
                dic[1]=dic[5];
                dic[5]=dic[4];
                dic[4]=tmp;
            }else if(s.charAt(i)=='E'){
                tmp=dic[0];
                dic[0]=dic[3];
                dic[3]=dic[5];
                dic[5]=dic[2];
                dic[2]=tmp;
            }else if(s.charAt(i)=='W'){
                tmp=dic[0];
                dic[0]=dic[2];
                dic[2]=dic[5];
                dic[5]=dic[3];
                dic[3]=tmp;
            }else{
                tmp=dic[0];
                dic[0]=dic[4];
                dic[4]=dic[5];
                dic[5]=dic[1];
                dic[1]=tmp;
            }
        }
         
        System.out.println(dic[0]);
         
        scan.close();
    }
}