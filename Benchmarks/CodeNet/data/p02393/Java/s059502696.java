import java.util.Scanner;
class Main{
    int a,b,c,d,e,f,g;
    public void Germany() {
        Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        
        if(a < b) {{
        	}if(a < c){
        	}else{
        		System.out.println(c + " " + a +" " + b);
        			}if(b<c){
        				System.out.println(a +" " + b +" " + c);
        			}else{
        				System.out.println(a +" " + c +" " + b);
        }if(b<c){
        	}if(a < c){
        		System.out.print(b +" " + a +" " + c);
        		}else
        			System.out.println(c +" " + b +" " + a);
        }else{
        	System.out.print(b +" " + c +" " + a);
        	}
    }
    public static void main(String[] args) {
        new Main().Germany();
    }
}