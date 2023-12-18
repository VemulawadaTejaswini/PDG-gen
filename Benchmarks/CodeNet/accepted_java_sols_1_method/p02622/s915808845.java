import java.util.*; 
public class Main{
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String str=sc.next();
       String str2=sc.next();
       int num=0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)==str2.charAt(i)){
               continue;
           }
           else{
               num++;
           }
       }
       System.out.print(num);
        sc.close();
    }
}