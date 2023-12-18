import java.util.*;
import java.io.*;

class Set{
    int num=0;
    int color=0; 

    static boolean sameNum(Set num1, Set num2, Set num3){
        if((num1.num == num2.num) && (num2.num == num3.num) && (num3.num == num1.num)){
            return true;
        }else{
            return false;
        }
    }

    static boolean serialNum(Set num1, Set num2, Set num3){
        if((num2.num - num1.num == 1) && (num3.num - num2.num == 1)){
            return true;
        }else{
            return false;
        }
    }

    static boolean sameColor(Set cl1, Set cl2, Set cl3){
        if((cl1.color == cl2.color) && (cl2.color == cl3.color) && (cl3.color == cl1.color)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean alternateColor(Set cl1, Set cl2, Set cl3){
        if((cl1.color != cl2.color) && (cl2.color != cl3.color) && (cl3.color != cl1.color)){
            return true;
        }else{
            return false;
        }
    }
} //end_of_Set

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //number_of_data-set

    for(int i=0;i<n;i++){
      int[] num = new int[9];
      for(int j=0;j<9;j++){
        num[j] = sc.nextInt();
      }
      sc.nextLine();
      String line = sc.nextLine();
      String[] ch= line.split(" ");
      int[] color = new int[9];
      for(int l=0;l<9;l++){
        switch(ch[l]){
          case "R": color[l] = 1;
                    break;
          case "G": color[l] = 2;
                    break;
          case "B": color[l] = 3;
                    break;
          default : break;
        }
      }
      
      Set[] set1 = new Set[3];
      Set[] set2 = new Set[3];
      Set[] set3 = new Set[3];
      for(int j=0;j<3;j++){
          set1[j] = new Set(); 
          set1[j].num = num[j]; 
          set1[j].color = color[j];
      }
      for(int j=0;j<3;j++){
          set2[j] = new Set();
          set2[j].num = num[j+3];
          set2[j].color = color[j+3];
      }
      for(int j=0;j<3;j++){
          set3[j] = new Set();
          set3[j].num = num[j+6];
          set3[j].color = color[j+6];
      }

      int accept = 0;
      Set check1 = new Set();
      Set check2 = new Set();
      Set check3 = new Set();
      if(check1.sameNum(set1[0],set1[1],set1[2])){
          if(check1.alternateColor(set1[0],set1[1],set1[2])){
             accept++;
          }else{
             System.out.println(0);
             continue;
          }
      }
      else if(check1.serialNum(set1[0],set1[1],set1[2])){
          if(check1.sameColor(set1[0],set1[1],set1[2])){
             accept++;
          }else{
            System.out.println(0);
            continue; 
          }
      }
      else{
        System.out.println(0);
        continue;
      }
      
      if(check2.sameNum(set2[0],set2[1],set2[2])){
          if(check2.alternateColor(set2[0],set2[1],set2[2])){
             accept++;
          }else{
             System.out.println(0);
             continue;
          }
      }
      else if(check2.serialNum(set2[0],set2[1],set2[2])){
          if(check2.sameColor(set2[0],set2[1],set2[2])){
             accept++;
          }else{
            System.out.println(0);
            continue; 
          }
      }
      else{
        System.out.println(0);
        continue;
      }

      if(check3.sameNum(set3[0],set3[1],set3[2])){
          if(check3.alternateColor(set3[0],set3[1],set3[2])){
             accept++;
          }else{
             System.out.println(0);
             continue;
          }
      }
      else if(check3.serialNum(set3[0],set3[1],set3[2])){
          if(check3.sameColor(set3[0],set3[1],set3[2])){
             accept++;
          }else{
            System.out.println(0);
            continue; 
          }
      }
      else{
        System.out.println(0);
        continue;
      }

    System.out.println(1);
    }//end_of_while
  }//end_of_main
}//end_of_Rummy