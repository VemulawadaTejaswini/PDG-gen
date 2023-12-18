import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        int n = Integer.parseInt(sn.next());
        int list[] = {0,0,0,0};
        String str;

        for (int i = 0; i < n; i++){
            str = sn.next();
            switch(str){
                case "AC":
                    list[0] = list[0] + 1;
                    break;
                case "WA":
                    list[1] = list[0] + 1;
                    break;
                case "TLE":
                    list[2] = list[0] + 1;
                    break;
                case "RE":
                    list[3] = list[0] + 1;
                    break;
            }
        }
        System.out.println("AC × " + list[0]);
        System.out.println("WA × " + list[1]);
        System.out.println("TLE × " + list[2]);
        System.out.println("RE × " + list[3]);
    }
}


