/*Collectionsクラスのソートを使う場合は
intなどのプリミティブ型は使えなくて
Integerなどのクラス型でないとダメらしい。
昇順->Arrays.sort(配列名)なのでintでもok*/

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Integer[] a = new Integer[n];
    //int[] a = new int[n];
    int AliceSum = 0;
    int BobSum = 0;

    for(int i = 0; i < n; i++){a[i] = scan.nextInt();}
    Arrays.sort(a, Collections.reverseOrder());

    for(int i = 0; i < n; i+=2)
      AliceSum += a[i];
    for(int i = 1; i < n; i+=2)
      BobSum += a[i];

      System.out.println(AliceSum-BobSum);

    }
  }
