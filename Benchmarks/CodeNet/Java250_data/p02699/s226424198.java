/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author yoovraj.shinde
 */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String[] sa = br.readLine().split(" ");
                if (Integer.parseInt(sa[1]) >= Integer.parseInt(sa[0])) {
                    System.out.println("unsafe");
                } else {
                    System.out.println("safe");
                }

        }
}
