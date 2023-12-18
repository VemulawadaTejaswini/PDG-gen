import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hairetu[] = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};

        int k = sc.nextInt();

        System.out.println(hairetu[k-1]);

	}
}