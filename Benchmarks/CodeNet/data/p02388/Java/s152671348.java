import java.util.Scanner;

class AskCubeOfX {
    
    public int Input() {
        
        int x = 0;
        Scanner in = new Scanner(System.in);
        
        x = in.nextInt();
        
        return x;
    }
    
    public int askCube(int x) {
        return  x * x * x;
    }
    
    public void Print(int cube) {
        System.out.println(cube);
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 0, cube = 0;
        
        AskCubeOfX test = new AskCubeOfX();
        
        x = test.Input();
        
        cube = test.askCube(x);
        
        test.Print(cube);
    }
}