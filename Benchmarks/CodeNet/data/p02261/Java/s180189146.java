// ALDS1_2_C Stable Sort
import java.io.*;
import java.util.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         int N = Integer.parseInt(br.readLine());
         Trump[] card = new Trump[N];
         String[] inputAry = br.readLine().split(" ");
         for (int i = 0; i < N; i++) {
            card[i] = new Trump(inputAry[i]);
         }
         Trump[] bubble, selection;
         bubble = BubbleSort(card, N);
         selection = SelectionSort(card, N);
         for (int i = 0; i < N; i++) {
            if (i == N - 1) {
               System.out.println(bubble[i].getCard());
            } else {
               System.out.print(bubble[i].getCard() + " ");
            }
         }
         System.out.println("stable");
         for (int i = 0; i < N; i++) {
            if (i == N - 1) {
               System.out.println(selection[i].getCard());
            } else {
               System.out.print(selection[i].getCard() + " ");
            }
         }
         if (isStable(bubble, selection, N)) {
            System.out.println("Stable");
         } else {
            System.out.println("Not stable");
         }
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static Trump[] BubbleSort(Trump[] card, int N) {
      Trump[] tmpAry = Arrays.copyOf(card, card.length);
      Trump tmp;
      boolean flag = true;
      while (flag) {
         flag = false;
         for (int j = N - 1; j >= 1; j--){
            if (tmpAry[j].getValue() < tmpAry[j - 1].getValue()) {
               tmp = tmpAry[j];
               tmpAry[j] = tmpAry[j - 1];
               tmpAry[j - 1] = tmp;
               flag = true;
            }
         }
      }
      return tmpAry;
   }
   static Trump[] SelectionSort(Trump[] card, int N) {
      Trump[] tmpAry = Arrays.copyOf(card, card.length);
      Trump tmp;
      int minj;
      for (int i = 0; i < N; i++) {
         minj = i;
         for (int j = i; j < N; j++) {
            if (tmpAry[j].getValue() < tmpAry[minj].getValue()){
               minj = j;
            }
         }
         if (i != minj) {
            tmp = tmpAry[i];
            tmpAry[i] = tmpAry[minj];
            tmpAry[minj] = tmp;
         }
      }
      return tmpAry;
   }
   static boolean isStable(Trump[] in, Trump[] out, int N) {
      for (int i = 0; i < N; i++) {
         if (in[i].getValue() == out[i].getValue() && in[i].getSuit() != out[i].getSuit()) {
            return false;
         }
      }
      return true;
   }
}

class Trump {
   String card;

   public Trump(String card) {
      this.card = card;
   }

   char getSuit() {
      char suit = card.charAt(0);
      return suit;
   }
   int getValue() {
      int value = Integer.parseInt(card.substring(1,2));
      return value;
   }
   String getCard() {
      return card.toString();
   }
}