import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int count;
        int[] id;
        int[] k;
        int[][] c;

        int[] parent;
        int[] depth;

        try{
            Scanner scan = new Scanner(System.in);
            String str;

            str = scan.nextLine();
            count = Integer.parseInt(str);

            id = new int[count];
            k = new int[count];
            parent = new int[count];
            depth = new int[count];
            c = new int[count][];

            for(int i = 0; i < count; i++){
                str = scan.next();
                id[i] = Integer.parseInt(str);;

                str = scan.next();
                k[i] = Integer.parseInt(str);

                c[i] = new int[k[i]];

                for(int j = 0; j < k[i]; j++){
                    str = scan.next();
                    c[i][j] = Integer.parseInt(str);
                    parent[c[i][j]] = i;
                    depth[c[i][j]] = depth[i] + 1;;
                }
                // for(int j = 0; j < c[count].length; j++){
                // }
                if(id[i] == 0){
                    parent[i] = -1;
                }
            }



            for(int i = 0; i < count; i++){
                System.out.print("node "+ i + ": parent = "
                                   + parent[i] + ", depth = "
                                   + depth[i]);

                if(id[i] == 0){
                    System.out.print(", root, [");
                    for(int j = 0; j < k[i]; j++){
                        if(j == k[i] - 1){
                            System.out.print(c[i][j]);
                        }else{
                            System.out.print(c[i][j] + ", ");
                        }
                    }
                    System.out.println("]");
                }else if(k[i] > 0){
                    System.out.print(", internal node, [");
                    for(int j = 0; j < k[i]; j++){
                        if(j == k[i] - 1){
                            System.out.print(c[i][j]);
                        }else{
                            System.out.print(c[i][j] + ", ");
                        }
                    }
                    System.out.println("]");
                }else{
                    System.out.println(", leaf, []");
                }
                            //if(){

                //}else{

                //}
            }

        }catch(Exception e){
            System.out.println("ERROR " + e);
        }
    }
}

