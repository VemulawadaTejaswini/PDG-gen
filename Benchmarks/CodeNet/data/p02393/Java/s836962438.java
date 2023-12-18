import java.util.Scanner;
class Main{
    int a,b,c,d,e,f,g;
    public void Germany() {
        Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a<b){
            	if(a<c){
            		if(b<c){
            			System.out.println(a + " " + b + " " + c);
            		}else{
            			System.out.println(a + " " + c + " " + b);
            		}
            	}else{
            		System.out.println(c + " " + a + " " + b);
            	}
            }else{
            	if(b<c){
            		if(a<c){
            			System.out.println(b + " " + a + " " + b);
            		}else{
            			System.out.println(b + " " + c + " " + a);
            		}
            	}else{
            		System.out.println(c + " " + b + " " + a);
            	}
            }
    	}
            
    public static void main(String[] args) {
        new Main().Germany();
    }
}