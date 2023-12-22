import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int q = Integer.parseInt(line);
        ArrayList<Integer> list = new ArrayList<Integer>();
        /*0:pushBack(x): 末尾にx
          1:randomAccess(p):Aの要素apの値を出力する
          2:popBack(): Aの末尾の要素を削除する
        */
        for(int i = 0; i < q; i++) {
            String line1 = sc.nextLine();
            String[] line1sp = line1.split(" ");
            int sousa = Integer.parseInt(line1sp[0]);
            if(sousa == 0) {
                int x = Integer.parseInt(line1sp[1]);
                list.add(x);
            } else if(sousa == 1) {
                int p = Integer.parseInt(line1sp[1]);
                System.out.println(list.get(p));
            } else if(sousa == 2) {
                list.remove(list.size()-1);
            }
        }
    }
 } 
