import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner a =  new Scanner(System.in);
        int W = a.nextInt(), H = a.nextInt(), x = a.nextInt(), y = a.nextInt(), r = a.nextInt();
        
        if(x + r < W && y + r < H ){
            System.out.println("Yes");
	}else {
	    System.out.println("No");
	}
        
    }
    
}