/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author sahil
 */

public class main {

    private static Scanner input;
	public static void main(String[] args) {
     
                input = new Scanner(System.in);
		int arr[]=new int[10];
                for(int i=0;i<10;i++)
                {
                    arr[i]=input.nextInt();
                }
                for(int j=0;j<3;j++)
                {
                    for(int k=0;k<10-j-1;k++)
                    {
                        if(arr[k]>arr[k+1])
                        {
                            int temp=arr[k];
                            arr[k]=arr[k+1];
                            arr[k+1]=temp;
                        }
                    }
                }
		
                for(int i=7;i<10;i++)
                {
                    System.out.println(arr[i]);
                }
                
		
		}
		
		
   
    }
    