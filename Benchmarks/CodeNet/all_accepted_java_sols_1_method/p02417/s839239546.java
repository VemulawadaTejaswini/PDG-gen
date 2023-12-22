import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        
        int[] a = new int[200];
        
        while(sc.hasNext()){ 
            
        String as = sc.nextLine();
        String s = as.toLowerCase();
        
        for(int i=0;i<s.length();i++){
        	char ch = s.charAt(i);
            a[ch]+=1;
       	 }
        }
        char d=97;
        for(int j=97;j<123;j++){
            
            System.out.print(d+" : ");
            System.out.println(a[j]);
            d++;
        }
    }
}
