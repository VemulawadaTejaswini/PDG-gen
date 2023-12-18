import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();

        while (true) {
            int MSPrime = s.nextInt();
            if (MSPrime == 1) break;

            list.clear();
            ans.clear();

            for (int i = 2; i <= MSPrime; i++) {
                if (i % 7 == 1 || i % 7 == 6)
                    list.add(i);
            }

            for(int i=0;i<list.size();i++){
                int temp=list.get(i);
                if(MSPrime%temp==0) {
                    ans.add(temp);
                    for(int j=i+1;j<list.size();j++){
                        int temp2=list.get(j);
                        if(temp2%temp==0)
                            list.remove(j);
                    }
                }
            }

            System.out.print(MSPrime + ":");
            for(int i=0;i<ans.size();i++){
                System.out.print(" " + ans.get(i));
            }
            System.out.println();

        }
    }
}