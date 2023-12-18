import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int scoa1=0,scoa2=0;
        String str;
        
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        	str = sc.next();
        	String data[] = str.split(" ");
        	if(data[1].compareToIgnoreCase(data[2])==-1)scoa1+=3;
        	else if(data[1].compareToIgnoreCase(data[2])==1)scoa2+=3;
        	else if(data[1].compareToIgnoreCase(data[2])==-0){
        		scoa1++;scoa2++;
        	}else{
        		System.out.println("EEE");
        	}
        }
        System.out.println(scoa1+" "+scoa2);
        sc.close();
        
        
        
    }
}
