package ALDS1_3;

import java.util.*;

public class Main {
    static Deque<Integer> list  =new ArrayDeque<>();
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] sp =new String[2];
        for(int i=0;i<n;i++){
           sp = sc.nextLine().trim().split(" ");
            if (sp[0].equals("insert")){
                list.addFirst(Integer.parseInt(sp[1]));
            } else if (sp[0].equals("delete")){
                Integer m = Integer.parseInt(sp[1]);
                list.remove(m);
            } else if (sp[0].equals("deleteFirst")){
                list.removeFirst();
            }else if (sp[0].equals("deleteLast")){
                list.removeLast();
            }
        }

        if(!list.isEmpty()){
            ans.append(list.getFirst());
            list.removeFirst();
        }
        while(!list.isEmpty()){
            ans.append(" ").append(list.getFirst());
            list.removeFirst();
        }

        System.out.println(ans.toString());
//        for (Integer i=0;i<list.size()-1;i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println(list.get(list.size()-1));
    }
}

