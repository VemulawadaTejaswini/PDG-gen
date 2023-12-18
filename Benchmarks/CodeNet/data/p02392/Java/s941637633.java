import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        String [] data = new String[3];
        int [] abc = new int[3];
        for(i=0;i<3;i++){
            data[i]=scan.next();
            abc[i]=new Integer(data[i]);
        }
        String result=check(abc);
        if(!(result=="Yes")) result="No";
        System.out.println(result);
    }
    
    public static String check(int [] abc){
        String result = "";
        if((abc[0] < abc[1]) && (abc[1] < abc[2])) result = "Yes";
        
        return result;
    }
    
}