import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        
        int a[]= new int[26];
        
        String str=sc.nextLine();
        str=str.trim().toLowerCase();
        
        for(int i=0;i<str.length();i++){
            
                char c= str.charAt(i);
            
            int index=c-'a';
            a[index]=a[index]+1;
        }for(int i=0;i<a.length;i++){
            if(a[i]==0)
            {
                System.out.println((char)(i+'a')+" : "+ "0");
            }else{
                 System.out.println((char)(i+'a')+" : "+ a[i]);
            }
        }
        

        
       
        
       
    }
}

