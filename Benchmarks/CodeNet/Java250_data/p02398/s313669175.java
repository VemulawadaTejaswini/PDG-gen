import java.util.Scanner;

class Main{
public static void main(String[] args){

	Scanner s = new Scanner(System.in);
	
	int a= s.nextInt();
    int b= s.nextInt();
    int c= s.nextInt();
    int cnt=0;
    for(int i=a;i<=b;i++){
        
        if(c%i==0){
            
            cnt++;
        }else{continue;}
        }
    
		System.out.println(cnt);
		
		
	}
	
}

