package com.codinghero.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int vertexNum = c.nextInt();
        int edgeNum = c.nextInt();
        int[][] edges = new int[edgeNum][2];
        for (int i = 0; i < edgeNum; i++) {
            edges[i][0] = c.nextInt();
            edges[i][1] = c.nextInt();
        }
        c.close();
        System.out.println(new Main().isCycleExisted(edges, vertexNum) ? 1 : 0);
    }

    public boolean isCycleExisted(int[][] edges, int vertexNum) {
        Graph graph = this.getGraph(edges, vertexNum);
        if (graph.graphEntrances.isEmpty()) {
            return true;
        }
        
//        Set<Integer> previousLevelVertexes = new HashSet<Integer>(graph.graphEntrances);
//        Set<Integer> visitedVertexes = new HashSet<Integer>(graph.graphEntrances);
//        while (!previousLevelVertexes.isEmpty()) {
//            Set<Integer> currentLevelVertexes = new HashSet<Integer>();
//            for (Integer vertexIndex : previousLevelVertexes) {
//                LinkedList<Integer> dependencies = graph.graph.get(vertexIndex);
//                for (Integer dependencyVertex : dependencies) {
//                    if (visitedVertexes.contains(dependencyVertex)) {
//                        return true;
//                    } else {
//                        currentLevelVertexes.add(dependencyVertex);
//                    }
//                }
//            }
//            previousLevelVertexes = currentLevelVertexes;
//        }
        return false;
    }

    /**
     * 
     * @param edges
     * @param vertexNum
     */
    private Graph getGraph(int[][] edges, int vertexNum) {
        // initialize graph & set to be not null
        ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>(vertexNum);
        for (int i = 0; i < vertexNum; i++) {
            graph.add(new LinkedList<Integer>());
        }

        Set<Integer> entrances = new HashSet<Integer>();
        for (int i = 0; i < vertexNum; i++) {
            entrances.add(i);
        }

        // create the graph
        for (int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            entrances.remove(edges[i][1]);
        }
        return new Graph(graph, entrances);
    }

    private class Graph {
        private ArrayList<LinkedList<Integer>> graph;
        private Set<Integer> graphEntrances;

        private Graph(ArrayList<LinkedList<Integer>> graph, Set<Integer> graphEntrances) {
            this.graph = graph;
            this.graphEntrances = graphEntrances;
        }
    }
}