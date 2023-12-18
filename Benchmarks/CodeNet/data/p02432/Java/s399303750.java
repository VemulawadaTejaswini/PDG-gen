import java.util.*;

public class Main{
        public static void main(String[] args){
                ArrayList<Integer> arr = new ArrayList<Integer>();
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                for(int i = 0; i < n; i++){
                        int cmd = scan.nextInt();
                        switch(cmd){
                                case 0:
                                        if(scan.nextInt() == 0) arr.add(0, scan.nextInt());
                                        else arr.add(scan.nextInt());
                                        break;
                                case 1:
                                        System.out.println(arr.get(scan.nextInt()));
                                        break;
                                case 2:
                                        if(scan.nextInt() == 0) arr.remove(0);
                                        else arr.remove(arr.size()-1);
                                        break;
                        }
                }
        }
}
