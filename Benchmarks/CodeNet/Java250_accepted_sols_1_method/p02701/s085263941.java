/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author Admin
 */
class Main {
    
    
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    
    int a=s.nextInt();
    
   TreeSet<String> set=new TreeSet<>();
    
    while(a-->0)
    {
    String str=s.next();
    
    set.add(str);
    }
    System.out.println(set.size());
    
    
    }
    
    
}
