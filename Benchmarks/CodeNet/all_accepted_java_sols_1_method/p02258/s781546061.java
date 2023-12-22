import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
        int i,j,t,k,minv,maxv;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        int r[]=new int[t+1];
        for(i=0;i<t;i++)
        {
        	r[i]=scan.nextInt();
        }
        minv=r[0];
        maxv=r[1]-r[0];
        for(j=1;j<t;j++)
        {
        	maxv=Math.max(maxv,r[j]-minv);
        	minv=Math.min(minv,r[j]);
        }
        System.out.println(maxv);
	}

}