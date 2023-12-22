import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int scoa1=0,scoa2=0;
        String data[] = new String[2];

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        	data[0] = sc.next();
        	data[1] = sc.next();
        	if(data[0].compareTo(data[1])<=-1){
        		scoa1+=3;
        	}
        	else if(data[0].compareTo(data[1])>=1){
        		scoa2+=3;
        	}
        	else if(data[0].compareTo(data[1])==0){
        		scoa1++;scoa2++;
        	}
        	else{
        		System.out.println("EEE");
        	}
        }
        System.out.println(scoa2+" "+scoa1);
        sc.close();
    }
}
