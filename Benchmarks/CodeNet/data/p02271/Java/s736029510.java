import java.io.*;
import java.util.*;


//I have to use hashset
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        str = br.readLine();
        int n = Integer.parseInt(str);

        str=br.readLine();
        String[] temp = str.split("\\s");
        int[] A = new int[temp.length];
        for(int i= 0;i<temp.length;i++){
            A[i] = Integer.parseInt(temp[i]);
        }

        str = br.readLine();
        int q = Integer.parseInt(str);

        str=br.readLine();
        String[] temp2 = str.split("\\s");
        int[] m = new int[temp.length];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i= 0;i<temp2.length;i++){
            m[i] = Integer.parseInt(temp2[i]);
            
            if(cal(A,m[i],list)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        
        
    }

    public static Boolean cal(int[] A,int m,ArrayList<Integer> list){
        if(A.length == 1 ){
            int ln = A[0];
            if(ln ==m){
                return true;
            }else{
                list.add(ln);
                if(list.size()>1){
                    int num = list.size();
                    for(int i=0;i<num -1;i++){
                        int sum = list.get(i) + ln;
                        if(sum == m){
                            return true;
                        }
                    }
                }
                return false;
            }    

        }else{
            int ln = A[A.length -1];
            if(ln ==m){
                return true;
            }else{
                list.add(ln);
                if(list.size()>1){
                    int num = list.size();
                    for(int i=0;i<num -1;i++){
                        int sum = list.get(i) + ln;
                        if(sum == m){
                            break;
                        }else{
                            list.add(sum);
                        }
                    }
                }
                int[] B = new int[A.length -1];
                for(int i=0;i<B.length;i++){
                    B[i] = A[i];
                }
                return cal(B,m,list);
            }
   
        }   
    }
}
