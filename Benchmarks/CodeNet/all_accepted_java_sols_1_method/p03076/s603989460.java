import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int ans = 0;
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        ArrayList<Integer> iList = new ArrayList<Integer>();
        
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 5 ; i++) {
            int num = scan.nextInt();
            if (num % 10 == 0) {
                ansList.add(num);
            } else {
                iList.add(num);
            }
        }
        
        ArrayList<Integer> iOneList = new ArrayList<Integer>();
        ArrayList<Integer> iTenList = new ArrayList<Integer>();
        
        for(int iListData : iList) {
            iOneList.add(iListData % 10);
            ansList.add(iListData - (iListData % 10));
        }
        
        if (iOneList.size() != 0) {
            Collections.sort(iOneList);
    
            ansList.add(iOneList.get(0));
            for(int i = 1; i < iOneList.size(); i++) {
                ansList.add(iOneList.get(i) + (10 - iOneList.get(i)));
            }
        }
        
        for(int num : ansList) {
            ans = ans + num;
        }
        
        System.out.println(ans);
    }
}
