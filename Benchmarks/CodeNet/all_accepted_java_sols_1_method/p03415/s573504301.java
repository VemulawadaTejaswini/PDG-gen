import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                String[] s = new String[3];
                for(int i=0;i<3;i++){
                        s[i] = sc.next();
                }
                char[] c = new char[3];
                for(int i=0;i<3;i++){
                        c[i] = s[i].charAt(i);
                }
                for(int i=0;i<3;i++){
                        System.out.print(c[i]);
                }
        }
}
