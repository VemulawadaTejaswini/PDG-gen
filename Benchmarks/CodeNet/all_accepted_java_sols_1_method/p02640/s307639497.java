import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int X  = sc.nextInt();
    int Y = sc.nextInt();

    int a = 0; 
    for(int i=0; i<100; i++){
    for(int j=0; j<100; j++){
    if(X==i+j){
        if(Y==2*i+4*j){
        a++;
        }
    }
    }
}
    if(a>0){
	System.out.println("Yes");  
    }else{        
	System.out.println("No");
	}
    }
    
}
