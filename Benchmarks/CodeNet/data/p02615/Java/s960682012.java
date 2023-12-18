import com.sun.jdi.IntegerType;
import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.IntersectionTypeTree;
import com.sun.source.tree.Tree;

import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.MutableAttributeSet;
import java.io.*;
import java.util.*;


class Main {


    public static void main(String args[]) throws Exception {


        Scanner r = new Scanner(System.in);

        int t = Integer.parseInt(r.nextLine());
        //int t = r.nextInt();


//        while (t > 0) {
//
//            
//
//
//            t--;
//
//        }
        
        int[] a = new int[t];

        for (int i = 0; i <t ; i++) {
            a[i] = r.nextInt();
        }
        
        Arrays.sort(a);
        int times = t-1;
        int sum = a[t-1];
        int cur = a[t-2];
        int j = 3;
        //System.out.println(Arrays.toString(a));

        for (int i = 1; i < times ; i++) {
            if (i%2 == 0)
                sum =  sum + cur;
            else
            {
                sum = sum + cur;
                cur = a[t-j];
                j++;
            }
            //System.out.println("sum = " + sum);
        }

        System.out.println(sum);
    }
}
