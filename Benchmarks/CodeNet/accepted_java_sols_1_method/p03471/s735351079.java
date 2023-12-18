import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long Y = scanner.nextLong();
        boolean found = false;
        for(int x=0;x<=n;x++){
            if(found) break;
            for(int y=0;y<=n;y++){
                int z = n-x-y;
                if(z>=0 && 10*x+5*y+z==Y/1000){
                    System.out.println(x+" " +y+" "+z);
                    found = true;
                    break;
                }
            }
        }
        if(!found) System.out.println("-1 -1 -1");
    }
}