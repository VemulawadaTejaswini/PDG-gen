import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Main {
	public static void main(final String[] args){
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    int[][] bingo = new int[3][3];
    int[] num = new int[10];
    for(int i = 0; i < 3 ; i++){
        for(int j = 0; j < 3 ; j++){
            bingo[i][j] = sc.nextInt();
        }
    }

    int n = sc.nextInt();

    for(int i = 0; i < n ; i++){
        num[i] = sc.nextInt();
    }

    for(int i = 0; i < n ; i++){
        for(int j = 0; j < 3; j++){
            for(int k = 0; k < 3 ; k++){
                if(num[i] == bingo[j][k]){
                    bingo[j][k] = 0;
                }
            }
        }
    }
    if(bingo[0][0]==0 && bingo[0][1]==0 && bingo[0][2]==0){
        System.out.println("Yes");
    }else if(bingo[1][0]==0 && bingo[1][1]==0 && bingo[1][2]==0){
        System.out.println("Yes");
    }else if(bingo[2][0]==0 && bingo[2][1]==0 && bingo[2][2]==0){
        System.out.println("Yes");
    }else if(bingo[0][0]==0 && bingo[1][0]==0 && bingo[2][0]==0){
        System.out.println("Yes");
    }else if(bingo[0][1]==0 && bingo[1][1]==0 && bingo[2][1]==0){
        System.out.println("Yes");
    }else if(bingo[0][2]==0 && bingo[1][2]==0 && bingo[2][2]==0){
        System.out.println("Yes");
    }else if(bingo[0][0]==0 && bingo[1][1]==0 && bingo[2][2]==0){
        System.out.println("Yes");
    }else if(bingo[2][0]==0 && bingo[1][1]==0 && bingo[0][2]==0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    
	}
}