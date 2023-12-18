import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int counter=0;
        ArrayList  matrix=new ArrayList();
        do {
            Scanner scan = new Scanner(System.in);
            matrix.add(scan.nextInt());
            counter+=1;
        }while(!matrix.contains(0));
        for(int i=0;i<counter-1;i++){
            System.out.println("Case "+(i+1)+": "+matrix.get(i));
            }
        }
    }