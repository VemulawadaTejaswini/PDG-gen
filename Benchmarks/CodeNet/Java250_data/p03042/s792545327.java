import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int migi = S%100;
    int hidari = (S-migi)/100;
    
    if(migi==0 && hidari==0) {
    	System.out.println("NA");
    }else if(hidari>12 && migi>12) {
    	System.out.println("NA");
    }else if(hidari>12 && migi==0) {
    	System.out.println("NA");
    }else if(hidari==0 && migi>12) {
    	System.out.println("NA");
    }else if(hidari>0 && hidari<=12 && migi>0 && migi<=12) {	
    System.out.println("AMBIGUOUS");
    }else if(hidari>0 && hidari<=12 && migi>12) {	
    System.out.println("MMYY");
    }else if(hidari>0 && hidari<=12 && migi==00) {	
        System.out.println("MMYY");
    }else {
    System.out.println("YYMM");
    }
}
}
