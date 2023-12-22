import java.io.*;
import java.util.*;


//I have to use hashset
public class Main{
    public static void main(String[] args)throws IOException{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        HashSet<String> d = new HashSet<String>();
        for(int i=0;i<n;i++){
            String temp = sc.next();
            String str = sc.next();
            if(temp.equals("insert")){
                d.add(str);
            }else if(temp.equals("find")){
                if(d.contains(str)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }

    }    
}
