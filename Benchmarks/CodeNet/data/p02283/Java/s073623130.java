/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aojbinary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author in2
 */
public class Main {
    
    class TreeNode{
        
        TreeNode left, right;
        long key;
        TreeNode(long key){
            left = right = null;
            this.key = key;
        }
        
}
    
    TreeNode root;
    
    Main(){
       root = null;
    }
    
    TreeNode insertNodeMain(TreeNode root, long key){
        if(root == null){
            root = new TreeNode(key);
            return root;
        }
            if(key < root.key)
                root.left = insertNodeMain(root.left, key);
            else if(key > root.key){
                root.right = insertNodeMain(root.right, key);
            }
        return root;
    }
    
    
    void insertNode(long key){
        root = insertNodeMain(root, key);
    }
    
    void putInOrder(TreeNode root){
        
        if(root!=null){
        putInOrder(root.left);
        System.out.println(root.key+" ");
        putInOrder(root.right);
        }
    }
    
    void putPreOrder(TreeNode root){
        
        if(root!=null){
        System.out.println(root.key+" ");    
        putPreOrder(root.left);
        putPreOrder(root.right);
        }
    }
    
    void put(){
        putInOrder(root);
        System.out.print("/n");
        putPreOrder(root);
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       // FileReader fl = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
       // System.out.println(testCases);
        Main tree = new Main();
        for(int i=0; i<testCases; i++){
         //   System.out.println("Enter command");
            String command = br.readLine();
            StringTokenizer defaultTokenizer = new StringTokenizer(command);
            String[] tokens = command.split(" ");
            if(tokens.length==2){
                long key = Integer.parseInt(tokens[1]);
                tree.insertNode(key);
                }
            else tree.put();    
            }
            
        }
}