import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();

            List<Integer> listA = new ArrayList<Integer>();
            for(int i=0; i<num; i++){
                listA.add(new Integer(scan.nextInt()));
            }
	        scan.close();

	        List<Integer> listB = new ArrayList<Integer>(new HashSet<>(listA));

	        if(listA.size() != listB.size()) {
	        	System.out.println("NO");
	        }else {
	            System.out.println("YES");
	        }

//	        int i = 0;
//            for(int i1=0; i1<list.size(); i1++) {
//            	for(int i2=0;i2<list.size() ; i2++) {
//            		if(i1 == i2) {
//            			System.out.println("----");
//            			System.out.println(i1);
//            			System.out.println(i2);
////            			continue;
//            			i++;
//            			if(i>1) {
//            				System.out.println("NO");
//                			return;
//            			}
//            		}
//            	}
//            }
//
//            System.out.println("YES,互いに異なるならば");

    }
}