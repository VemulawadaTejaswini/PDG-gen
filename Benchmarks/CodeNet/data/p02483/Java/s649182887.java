import java.util.Scanner;
 class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
 
        if (a < b){
        	if(b<c){
        		System.out.println("%d %d %d",a,b,c);

        	}
        	else if(c<a){
        		System.out.println("%d %d %d",c,a,b);

        	}
        	else{
        		System.out.println("%d %d %d",a,c,b);

        	}
        	    
        }
        else{
        	        	if(c<b){
        		System.out.println("%d %d %d",c,b,a);

        	}
        	else if(c>a){
        		System.out.println("%d %d %d",b,a,c);

        	}
        	else{
        		System.out.println("%d %d %d",b,c,a);

        	}

        }
        }
    }
}