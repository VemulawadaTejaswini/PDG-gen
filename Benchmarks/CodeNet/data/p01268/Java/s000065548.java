import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int size = 0;
        int[] al = new int[200000];
        for(int i = 2; i < 200000; i++){
        	boolean flg = true;
        	for(int j = 0; j < size; j++){
        		if(i % al[j] == 0){
        			flg = false;
        			break;
        		}
        	}
        	if(flg){
        		al[size] = i;
        		size++;
        	}
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        while(n != -1 || p != -1){
            ArrayList<Integer> addlist = new ArrayList<Integer>();
            int idx = 0;
            for(int i = 0; i < al.length; i++){
                if(al[i] > n){
                    idx = i;
                    break;
                }
            }
           for(int i = idx; i < idx + p; i++){
                for(int j = i; j < idx + p; j++){
                    addlist.add(al[i] + al[j]);
                }
            }
            Collections.sort(addlist);
            System.out.println(addlist.get(p - 1));
            n = sc.nextInt();
            p = sc.nextInt();
        }
        sc.close();
    }
 
}