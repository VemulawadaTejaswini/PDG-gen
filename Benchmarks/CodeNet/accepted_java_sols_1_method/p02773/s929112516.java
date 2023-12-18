import java.io.*;
import java.util.*;
public class Main{
   
     public static void main(String []args){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       HashMap<String,Integer>hm=new HashMap<>();
       String a[]=new String[n];
       for(int i=0;i<n;i++)
       {a[i]=s.next();
       if(hm.containsKey(a[i]))
       {int k=hm.get(a[i]);
       k++;
       hm.put(a[i],k);}
       else
       {hm.put(a[i],1);}}
     int max=0;
     for(Integer i:hm.values())
       {if(max<i)
       {max=i;}}
       ArrayList<String>al=new ArrayList<>();
       for (Map.Entry mapElement : hm.entrySet()) { 
            String key = (String)mapElement.getKey(); 
            if(max==(int)mapElement.getValue()) 
            al.add(key);}
            Collections.sort(al);
           for(int i=0;i<al.size();i++)
           System.out.println(al.get(i));
     }}