import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Boolean> dic=new HashMap<String,Boolean>();
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            String f=sc.next();
            String str=sc.next();
            if(f.equals("insert")) dic.put(str,true);
            else System.out.println(dic.containsKey(str)?"yes":"no");
        }
    }
}
