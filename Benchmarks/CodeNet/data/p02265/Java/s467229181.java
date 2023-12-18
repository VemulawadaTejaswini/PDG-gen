

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Integer> list  =new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){
            String[] sp = sc.nextLine().trim().split(" ");
            if (sp[0].equals("insert")){
                list.add(Integer.parseInt(sp[1]));
            } else if (sp[0].equals("delete")){
                Integer m = Integer.parseInt(sp[1]);
                list.remove(m);
            } else if (sp[0].equals("deleteFirst")){
                list.removeFirst();
            }else if (sp[0].equals("deleteLast")){
                list.removeLast();
            }
        }

        for (Integer i=list.size()-1;i>0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.print(list.get(0));
    }
}

