mport javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> numarray = new ArrayList<Integer>();
        String num = br.readLine();
        
        while(num != null){
            String[] temp = num.split("\\s");
            for(int i = 0;i<temp.length;i++){
                int temp2 = Integer.parseInt(temp[i]);
                numarray.add(temp2);
                //System.out.println(temp2);
            }
        num = br.readLine();
        }
        br.close();

        if(numarray.isEmpty() == false){
           
               for(int i = 0; i < numarray.size(); i+=2){
               int num1 = numarray.get(i);
               int i2 = i+1;
               int num2 = numarray.get(i2);
               if(num1 == 0 && num2 ==0){
                   break;
               }
               else if(num1 < num2){
                   String Ans1 = num1 + " "  + num2;
                   System.out.println(Ans1);
               }else{
                   String Ans2 = num2 + " " + num1;
                   System.out.println(Ans2);
               }
           }
        }
        
    }
}